object test {


  abstract  class person{
    def say={
      print("你很帅")
    }
  }

  def main(args: Array[String]): Unit = {
//    val person=new person {
//      override def say: Unit = print("一般般")
//    }

    val  person=new person {
      override def say: Unit = super.say
    }

    person.say
  }

}
