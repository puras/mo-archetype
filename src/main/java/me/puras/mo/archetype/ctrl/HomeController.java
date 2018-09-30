package me.puras.mo.archetype.ctrl;

import me.puras.mo.common.json.Response;
import me.puras.mo.common.json.ResponseHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping("")
    public Response home() {
        var ctrl = 10;
        var bool = true;
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        for (var str : list) {
            System.out.println(str);
        }
        String[] arr = "test\nhoge\n".lines().map(String::toUpperCase).toArray(String[]::new);
        System.out.println("Hello".repeat(3));
        Arrays.stream(arr).forEach(it -> System.out.println(it));
        return ResponseHelper.createSuccessResponse(list);
    }
}
