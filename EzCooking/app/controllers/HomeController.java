package controllers;

import models.Menu;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

import javax.inject.Inject;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    @Inject
    FormFactory formFactory;

    public Result index() {
        return ok(views.html.sreach.render());
    }


    public Result create() {
        return ok(views.html.Create.render());
    }

    public Result edit(){
        return ok(views.html.Edit.render());
    }
//<<<<<<< HEAD

    public String checklogin(String user,String pass) {
        List<Chef> chefList;
        chefList = Chef.find.all();
        String result;
        for (Chef e : chefList) {
            if (e.username.equals(user) && e.password.equals(pass)) {
                result = "Welcome!";
                break;
            } else if (e.username.equals(user)) {
                result = "Invalid Password!";
                break;
            } else if (e.password.equals(pass)) {
                result = "Invalid Username!";
                break;
            } else {
                result = "Invalid Username and Password!";
            }
        }
        return result;
    }

    public Result present() {return ok(views.html.Present.render());}
    public Result gg() {return ok(views.html.gg.render());}
    public Result showmenucos() {return ok(views.html.showmenucos.render());}
    public Result showmenuadmin() {return ok(views.html.showmenuadmin.render());}
    public Result ditailmenu() {return ok(views.html.ditailmenu.render());}

    //create menu
    public Result create(){
        Form<Menu> menuForm = formFactory.form(Menu.class);
        return ok(views.html.Create.render(menuForm));
    }

    // to save Menu
    public Result save(){
        Form<Menu> menuForm = formFactory.form(Menu.class).bindFromRequest();
        if(menuForm.hasErrors()){
            flash("danger","Please Correct the Form Below");
            return badRequest(views.html.Create.render(menuForm));
        }
        Menu menu = menuForm.get();
        menu.save();
        flash("success","Menu Save Successfully");
        return redirect(routes.HomeController.index());
    }

    ///edit menu
    public Result edit(Integer id){
        Menu menu = Menu.find.byId(id);
        if(menu==null){
            return notFound();
        }
        Form<Menu> menuForm = formFactory.form(Menu.class).fill(menu);
        return ok(views.html.Edit.render(menuForm));
    }

    //update menu
    public Result update(){

        Form<Menu> menuForm = formFactory.form(Menu.class).bindFromRequest();

        if (menuForm.hasErrors()){
            flash("danger","Please Correct the Form Below");
            return badRequest();
        }

        Menu menu = menuForm.get();
        Menu oldMenu = Menu.find.byId(menu.id);
        if(oldMenu ==null){
            flash("danger","Menu Not Found");
            return notFound();
        }
        oldMenu.types = menu.types;
        oldMenu.name = menu.name;
        oldMenu.time = menu.time;
        oldMenu.desc = menu.desc;
        oldMenu.update();
        flash("success","Menu Updated Successfully");
        return ok();
    }

    //delete Menu
    public Result delete(Integer id){

        Menu menu = Menu.find.byId(id);
        if(menu == null){
            flash("danger","Menu Not Found");
            return notFound();
        }
        menu.delete();
        flash("success","Menu Deleted Successfully");

        return ok();
    }


}










//=======

//>>>>>>> acd912585f84e587cbb4d06116e2f9fa2d972261
