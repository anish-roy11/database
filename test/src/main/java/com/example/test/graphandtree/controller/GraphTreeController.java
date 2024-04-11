package com.example.test.graphandtree.controller;

import com.example.test.graphandtree.service.GraphTreeService;
import com.example.test.linkedlist.dao.LinkedListImpl;
import com.example.test.restservice.controller.RestServiceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;


@RequestMapping("api/v1/graph_tree_controller")
@RestController
public class GraphTreeController {


    private static final Logger logger = Logger.getLogger(GraphTreeController.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/dfs", method= RequestMethod.GET)
    public void dfs() {
        logger.info("logEntry:/dfs url method");

        GraphTreeService g = new GraphTreeService(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+ "(starting from vertex 2)");

        // Function call
        g.DFS(2);


        logger.info("logExit:/dfs url method");
        //return numberList2;

    }
}




