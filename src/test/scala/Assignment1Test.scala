import java.io.File

import org.scalatest.AsyncFunSuite

import scala.concurrent.Future

class Assignment1Test extends AsyncFunSuite {

  val obj = new Assignment1

  val listFutureFiles: Future[List[File]] = obj.listFiles("/home/knoldus/IdeaProjects/Scala04/src/main/resources")

  val file1 = new File("/home/knoldus/IdeaProjects/Scala04/src/main/resources/ab.txt")
  val file2 = new File("/home/knoldus/IdeaProjects/Scala04/src/main/resources/abc.txt")
  val file3 = new File("/home/knoldus/IdeaProjects/Scala04/src/main/resources/folder3/2.txt")
  val file4 = new File("/home/knoldus/IdeaProjects/Scala04/src/main/resources/folder3/1.txt")

  test("Test Assignments 1") {

    listFutureFiles map (x => assert(x == List(file1, file2, file3, file4)))
  }

}
