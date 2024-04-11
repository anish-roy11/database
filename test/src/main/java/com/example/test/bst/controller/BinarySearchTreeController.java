package com.example.test.bst.controller;


import com.example.test.bst.dto.BinarySearchTree;
import com.example.test.excelfile.controller.ExcelFileController;
import com.example.test.excelfile.dao.ExcelFileManipulationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.util.logging.Logger;

@RequestMapping("api/v1/binary-search-tree")
@RestController
public class BinarySearchTreeController {

    @Autowired
    RestTemplate restTemplate;

    private static final Logger logger = Logger.getLogger(BinarySearchTreeController.class.getName());





    //@PostMapping("/insert-into-bst")
    //public void insertintobinarysearchtree(@RequestBody int key) {

//    @RequestMapping(value = "/insert-into-bst", method= RequestMethod.POST)
//    public void insertintobinarysearchtree(@RequestParam("key") int key) {
//

    @RequestMapping(value = "/insert-into-bst", method= RequestMethod.GET)
    public void insertintobinarysearchtree() {
    //public void insertintobinarysearchtree() {
        logger.info("log Entry:/insertintobinarysearchtree method");
        int key =10;
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */


        tree.insert(key);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();



        boolean isPresent=false;
        isPresent = tree.search(40);
        isPresent = tree.search(5777);


        tree.inorder();
        logger.info("deleting key 40");
        tree.deleteKey(40);
        logger.info("BST elements after deletion:");
        // print inorder traversal of the BST
        tree.inorder();

        logger.info("log Entry:/insert-into-bst url method");


    }






}
