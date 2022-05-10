fun main(){
    println("Hello Kotlin!")

    val order = 11_000 //сумма заказа
    val discountAbsolute = 100  //скидка 100 руб. за заказ от 1_000 руб. до 10_000 руб.
    val discountRelative = 0.95 //скидка 5% за заказ от 10_000 руб.
    val discountStart = 1000  //минимальна сумма заказа для скидки 100 руб.
    val discountFinal = 10_000 //минимальная сумма заказа для скидки 5%
    val discountMusicLover = 0.99 //скидка 1% постоянного покупателя
    val musicLover = true //признак постоянного покупателя

    val totalPrice = if (order <= discountStart) {
        order
    } else if (discountStart < order && order <= discountFinal) {
        order - discountAbsolute
    } else if (order > discountFinal && musicLover == true){
        order * discountRelative * discountMusicLover
    } else order * discountRelative


    println("total price: $totalPrice руб.")


}