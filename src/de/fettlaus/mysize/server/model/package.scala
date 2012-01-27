package de.fettlaus.mysize.server


package object model {
	import scala.reflect.BeanInfo
  trait DomainClass{
    def isNotEmptyString(str: String) = str != null && str.length >0
  }
	@BeanInfo
	case class Name(s:String) extends DomainClass{
	  
	}

}