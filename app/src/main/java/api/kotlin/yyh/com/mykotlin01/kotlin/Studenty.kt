package api.kotlin.yyh.com.mykotlin01.kotlin

/**
 * Created by Administrator on 2017/6/6/006.
 */
class Studenty private constructor() {

    private var name: String? = null

    private var age: Int = 25

    private var level:Int? = 0;

    private var sex:String = "男";

    constructor (name: String, age: Int,level: Int,sex : String): this() {

        this.name = name
        this.age = age
        this.level = level
        this.sex = sex
    }

}
