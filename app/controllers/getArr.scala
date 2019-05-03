package controllers

import java.io.{FileInputStream, ObjectInputStream}

import javax.inject.Inject
import models.inputArr
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import util.lib.{Calculate, Neuron, Weights}

class getArr @Inject()(cc:ControllerComponents) extends BaseController with Calculate{

  override protected def controllerComponents: ControllerComponents = cc
  override val learningRate = 0
  override val numberHiddenLayers = 1
  override val numberOfHiddenNeurons = 800
  override val numberOfInputNeurons = 784
  override val numberOfOutNeurons = 10
  override val weights: Weights = new Weights {
    val fis = new ObjectInputStream(new FileInputStream("TextArr"))
    override val weights: Array[Array[Array[Double]]] = fis.readObject().asInstanceOf[Array[Array[Array[Double]]]]
    fis.close()
  }
  override val neuronArray: Array[Array[Neuron]] = getNewNeuronsLayer

  val arrForm = Form {
    mapping{
      "arr" -> text
    }(inputArr.apply)(inputArr.unapply)
  }

  def getRes: Action[AnyContent] = Action{
    implicit request => {
      //val res = arrFor
      val out = request.body.asText.get
      val number = getValue(out)
      clearSide(neuronArray)
      //outValues(parse(out))
      Ok(number.toString)
    }
  }


  def parse(text: String) = {
    val prepare = text.split("\\s+")
    prepare.map(str => (255.0 - str.toDouble) / 255.0)
  }


  def getValue(str: String) = {
    val strOut : Array[Double] = parse(str)
    calculateOutValuesIteration(strOut)
    outputOfNeural(neuronArray(neuronArray.length - 1))
  }

  def outValues(value: Array[Double], rows: Int = 28) = {
    var z = 1
    for (y <- value) {
      print(y.round + " ")
      if (z % rows == 0 && z != 0)
        print("\n")
      z += 1
    }
  }
}
