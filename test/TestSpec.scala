import collection.mutable.Stack
import org.scalatest._

class ExampleSpec extends FlatSpec with MustMatchers {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    Tester.print("SPAM")
    stack.pop() mustBe (2)
    stack.pop() mustBe (1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[Int]
    a [NoSuchElementException] should be thrownBy {
      emptyStack.pop()
    }
  }
}

object Tester {
  def print(a: String) = {
    println(a)
  }
}