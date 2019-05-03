package util.lib

import java.io.{FileInputStream, ObjectInputStream}

object Parse extends App with Calculate{
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
  override val neuronArray = getNewNeuronsLayer



  def getStr(): String = {
    val fis = new ObjectInputStream(new FileInputStream("kekekeke"))
    fis.readObject().asInstanceOf[String]
  }

  def parse(text: String) = {
    val prepare = text.split("\\s+")
    prepare.map(str => if (str.toInt == 0) 255.0 else 0.0)
  }


  def getValue(str: String) = {
    val strOut : Array[Double] = parse(str)
    calculateOutValuesIteration(strOut)
    outputOfNeural(neuronArray(neuronArray.length - 1))
  }
}
