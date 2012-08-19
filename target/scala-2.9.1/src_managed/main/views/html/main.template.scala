
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>

  <head>
    <title>Backbone Demo: Todos in CoffeeScript</title>
    <link href="/assets/stylesheets/todos.css" media="all" rel="stylesheet" type="text/css"/>
    <script src="/assets/javascripts/lib/json2.js"></script>
    <script src="/assets/javascripts/lib/jquery-1.5.js"></script>
    <script src="/assets/javascripts/lib/underscore-1.1.6.js"></script>
    <script src="/assets/javascripts/lib/backbone.js"></script>
    <script src="/assets/javascripts/lib/backbone-localstorage.js"></script>
    <script src="/assets/javascripts/todos.js"></script>
  </head>

  <body>

    <!-- Todo App Interface -->

    <div id="todoapp">

      <div class="title">
        <h1>Todos</h1>
        <h3>in CoffeeScript</h3>
      </div>

      <div class="content">

        <div id="create-todo">
          <input id="new-todo" placeholder="What needs to be done?" type="text" />
          <span class="ui-tooltip-top" style="display:none;">Press Enter to save this task</span>
        </div>

        <div id="todos">
          <ul id="todo-list"></ul>
        </div>

        <div id="todo-stats"></div>

      </div>

    </div>

    <h3>Instructions:</h3>
    <ul id="instructions">
      <li>Double-click to edit a todo.</li>
      <li><a href="docs/coffeescript/todos.html">View the annotated CoffeeScript source.</a></li>
      <li><a href="http://github.com/JasonGiedymin/backbone-todojs-coffeescript">View the GitHub repository.</a></li>
      <li><a href="js-ver/index.html">Play with the original app.</a></li>
      <li><a href="docs/js/todos.html">View the original annotated source</a></li>
    </ul>

    <div id="credits">
      CoffeeScript version done by
      <br />
      <a href="http://jasongiedymin.com/">Jason Giedymin</a>
      <br />
      <a href="http://github.com/JasonGiedymin/">GitHub</a>
      <br />
      <a href="twitter.com/jasongiedymin">Twitter</a>
    </div>

    <div id="credits">
      Originally Created by
      <br />
      <a href="http://jgn.me/">J&eacute;r&ocirc;me Gravel-Niquet</a>
    </div>

    <!-- Templates -->

    <script type="text/template" id="item-template">
      <div class="todo <%= done ? 'done' : '' %>">
        <div class="display">
          <input class="check" type="checkbox" <%= done ? 'checked="checked"' : '' %> />
          <div class="todo-content"></div>
          <span class="todo-destroy"></span>
        </div>
        <div class="edit">
          <input class="todo-input" type="text" value="" />
        </div>
      </div>
    </script>

    <script type="text/template" id="stats-template">
      <% if (total) """),format.raw("""{"""),format.raw/*86.22*/(""" %>
        <span class="todo-count">
          <span class="number"><%= remaining %></span>
          <span class="word"><%= remaining == 1 ? 'item' : 'items' %></span> left.
        </span>
      <% """),format.raw("""}"""),format.raw/*91.11*/(""" %>
      <% if (done) """),format.raw("""{"""),format.raw/*92.21*/(""" %>
        <span class="todo-clear">
          <a href="#">
            Clear <span class="number-done"><%= done %></span>
            completed <span class="word-done"><%= done == 1 ? 'item' : 'items' %></span>
          </a>
        </span>
      <% """),format.raw("""}"""),format.raw/*99.11*/(""" %>
    </script>

  <script type="text/javascript">
  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-8200340-12']);
  _gaq.push(['_trackPageview']);

  (function() """),format.raw("""{"""),format.raw/*107.16*/("""
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  """),format.raw("""}"""),format.raw/*111.4*/(""")();
  </script>

  <a href="http://github.com/JasonGiedymin/backbone-todojs-coffeescript"><img style="position: absolute; top: 0; right: 0; border: 0;" src="https://gs1.wac.edgecastcdn.net/80460E/assets/img/abad93f42020b733148435e2cd92ce15c542d320/687474703a2f2f73332e616d617a6f6e6177732e636f6d2f6769746875622f726962626f6e732f666f726b6d655f72696768745f677265656e5f3030373230302e706e67" alt="Fork me on GitHub"></a>

  </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Aug 18 17:17:28 MDT 2012
                    SOURCE: /Users/jason/Desktop/workspace/backboneTodoCoffeeScript/backboneTodoCoffee/app/views/main.scala.html
                    HASH: 9c06a4be6fa6730d936d4aa1949eb16e1576aa56
                    MATRIX: 509->1|616->31|3282->2650|3531->2852|3602->2876|3903->3130|4125->3304|4477->3609
                    LINES: 19->1|22->1|107->86|112->91|113->92|120->99|128->107|132->111
                    -- GENERATED --
                */
            