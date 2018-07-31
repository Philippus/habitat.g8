package $organization$
package $name$

import org.scalacheck._
import org.scalacheck.Prop._

object ExampleSpec extends Properties("Example") {
  property("cubes correctly") = forAll {
    i: Int =>
      Example.cube(i) === i * i * i
  }
}
