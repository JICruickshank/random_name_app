import static spark.Spark.get;
import spark.Spark;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        get("/one", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            String name = randomiser.pickRandomName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);
            model.put("template", "one.vtl");
            return new ModelAndView(model, "layout.vtl");
            }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            Randomiser randomiser = new Randomiser();
            List<String> pair = randomiser.pickRandomPair();
            HashMap<String, Object> model = new HashMap<>();
            model.put("pair", pair);
            model.put("template", "two.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/:num", (req, res) -> {
            int groupSize = Integer.parseInt(req.params(":num"));
            Randomiser randomiser = new Randomiser();
            List<String> group = randomiser.pickRandomGroup(groupSize);
            HashMap<String, Object> model = new HashMap<>();
            model.put("group", group);
            model.put("template", "group.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);
    }




}
