open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}
class FoldablePhone(isScreenLightOn : Boolean, var isFolded : Boolean = true) :
	Phone(isScreenLightOn = isScreenLightOn){
    override fun switchOn(){
        if(isFolded == false){
        	isScreenLightOn = true
        }
    }
    override fun switchOff(){
        isFolded = true
        isScreenLightOn = false
    }
    fun fold(){
        switchOff()
    }
    fun unFold(){
        isFolded = false
        switchOn()
    }
}

fun main() {
    var p = FoldablePhone(false)
    p.checkPhoneScreenLight()
    p.unFold()
    p.checkPhoneScreenLight()
}
