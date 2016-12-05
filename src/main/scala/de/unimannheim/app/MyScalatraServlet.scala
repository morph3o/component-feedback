package de.unimannheim.app

import de.unimannheim.data.PageDao
import org.scalatra._

class MyScalatraServlet extends ComponentFeedbackStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

  get("/pages/:slug") {
    contentType = "text/html"
    PageDao.pages find (_.slug == params("slug")) match {
      case Some(page) => ssp("/pages/show", "page" -> page)
      case None => halt(404, "not found")
    }
  }

}
