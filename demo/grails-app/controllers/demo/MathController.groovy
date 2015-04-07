package demo

class MathController {

    def multiplicationHelper
    def multiply(int number) {
        def result = multiplicationHelper.multiply(number)
        render "The result is $result"
    }
}
