open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isPhoneFolded: Boolean = false) :Phone() {
    override fun switchOn() {
        if (isPhoneFolded) {
            isScreenLightOn = false
        }
        else {
            isScreenLightOn = true
        }
    }
    
    fun fold() {
        isPhoneFolded = true
       	switchOff()
    }
    
    fun unfold() {
        isPhoneFolded = false
    }
    
}

fun main() {
    val phone = FoldablePhone()
    phone.unfold()
    phone.switchOn()
    phone.checkPhoneScreenLight()
    phone.fold()
    phone.checkPhoneScreenLight()
    
}
