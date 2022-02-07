package $organization$
package $mainPackage$

import munit.ScalaCheckSuite
import org.scalacheck.Prop._

class ExampleSuite extends ScalaCheckSuite {
  property("cubes correctly") {
    forAll { i: Int =>
      Example.cube(i) === i * i * i
    }
  }
}
