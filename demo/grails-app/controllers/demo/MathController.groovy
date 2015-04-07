package demo

class MathController {

    def multiply(int number) {
        def result = number * 2
        render "The result is $result"
    }
}
