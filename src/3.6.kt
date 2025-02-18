fun main() {
    val myHTML = html {
        head {
            title("Mi pagina hecha con MI DSL")
        }
        body {
            h1("texto h1 muy bonito")
            p("texto párrafo precioso")
        }
    }

    println(myHTML)
}

class Head {
    var content: String = ""
    fun title(text:String) {
        content += "<title>$text</title>"
    }
}

class HTML {
    private val children = mutableListOf<String>()
    fun inicio(){
        children.add("<html>")
    }
    fun head(init: Head.() -> Unit) {
        val head = Head()
        head.init()
        children.add("<head>${head.content}</head>")
    }

    fun body(init: Body.() -> Unit) {
        val body = Body()
        body.init()
        children.add("<body>${body.content}</body>")
    }
    fun final(){
        children.add("</html>")
    }

    override fun toString(): String {
        return children.joinToString("\n")
    }
}

class Body {
    var content: String = ""

    fun p(text: String) {
        content += "<p>$text</p>"
    }

    fun h1(text: String) {
        content += "<h1>$text</h1>"
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML() //crea el objeto receptor
    html.inicio()
    html.init()// incializamos con la lambda el objeto receptor
    html.final()
    return html
}
