package org.swcraft.functional.scala

import scala.annotation.tailrec

object Main extends App {
  println("Hello, World!")
  val inst = new MyClass()
  //println(inst.add(1, 2))
  //println(inst inc 3)
  
  val max = inst findMax List(1, 6, 4, 2)
  val converted = max match {
    case None => -1
    case Some(x: Int) if x > 5 => x * 2
    case Some(x: Int) => x
  }
  println(converted)
  println(inst findMax List())
  val zipped = inst.zip(List("John", "Doe", "John"), List(25, 40, 50))
  println(zipped)
  
  zipped.foreach( x => {
    x match {
      case ("John", age) => println("Hello John with age " + age)
      case ("Doe", 40) => println("Oh it's Doe..!")
      case _ => println("Default case")
    } 
  })

  val wrapper1 = IntWrapper(5)
  val wrapper2 = IntWrapper(9)
  println(wrapper1.x)
  println(wrapper1 + wrapper2)
  println(wrapper1.+(wrapper2))
  // wrapper1.x = 10 // Illegal!
}



class MyClass {
  def add(a: Int, b: Int) = {
  	a + b
  }
  
  def inc(a: Int): Int = {
  	a + 1
  }
  
  def findMax(list: List[Int]): Option[Int] = {
    if (list.isEmpty) None else Some(list.reduceLeft((x, y) => x max y))
  }

  def max(xs: List[Int]): Option[Int] = xs match {
    case Nil            => None
    case List(x: Int)   => Some(x)
    case x :: y :: rest => max((if (x > y) x else y) :: rest)
  }
  
  
  
  def zip(names: List[String], ages: List[Int]) = {
    val these = names.iterator
    val those = ages.iterator
    var b: List[(String, Int)] = List()
    while (these.hasNext && those.hasNext)
      b = b :+ ((these.next(), those.next()))
    b
  }

}

case class IntWrapper(val x: Int) {
  
  def +(other: IntWrapper) = {
    IntWrapper(this.x + other.x)
  }
}