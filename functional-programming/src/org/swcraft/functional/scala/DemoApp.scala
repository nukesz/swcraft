package org.swcraft.functional.scala

object DemoApp {
  def main(args: Array[String]) = {
    val obj = new MyClassScala()
    //println(obj.addNumber(3, 4))
    //println(obj id 3)
   
    val max = obj findMax List(-2, -1, 1, 5, 2, 7, 4)
    println(max.get)
    val max2 = obj.findMax(List())
    
    val newValue = max match {
      case None => -1
      case Some(x) if x > 6 => x + 5
      case Some(x) => x
    }
    println(newValue)

    val returned = obj + 100
    println(returned)
    
    //val t = obj.generateValues("John", 30)
    val t = obj.generateValues("Norbi", 30)
    val age = t match {
      case (_, x, _) => x
    }
    println(obj.methodA())
  }
}

class MyClassScala {
  
  def addNumber(a: Int, b: Int) = a + b
  
  def ifWorking(a: Int) = {
    if (a > 5) 10 else 4
  }
  
  def id(a: Int) = {
    if (true) {
      "True case"
    } else {
      5
    }
  }
  
  
  def findMax(list: List[Int]): Option[Int] = {
    if (list.isEmpty) None 
    else Some(list.reduceLeft((x, y) => x max y))
  }
  
  def +(a: Int) = {
    a + 10
  }
  
  def generateValues(name: String, age: Int) = {
    (name, age, 10000)
  }
  
  def methodA() = {
    val scal = new ScalaToJava
  }
}

class ScalaToJava() {
  def helloWorld() = {
    "Hello from Scala"
  }
}