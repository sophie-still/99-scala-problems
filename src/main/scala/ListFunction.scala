object ListFunction {

  //1
  def getLastElement(list: List[Int]): Int = {
    list.last
  }

  //2
  def getPenultimateElement[A](list: List[A]): A = {
    val n = countElements(list)
    println("Number of elements in list (n): " + n)
    list.apply({
      n - 2
    })
  }

  //3
  def getKthElement[A](list: List[A], k: Int): A = {
    list.apply({
      k - 1
    })
  }
//4
  def countElements[A](list: List[A]): Int = {
    list.length
  }

}

//git remote add origin git@github.com:sophie-still/99-scala-problems.git
//git add .gitignore
//git commit -m "Added .gitignore"
//git push
//git push -f --set-upstream origin master


