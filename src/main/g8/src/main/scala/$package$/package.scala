package $organization$

package object $name$ {
  implicit final class AnyOps[A](self: A) {
    def ===(other: A): Boolean = self == other
    def =!=(other: A): Boolean = self != other
  }
}
