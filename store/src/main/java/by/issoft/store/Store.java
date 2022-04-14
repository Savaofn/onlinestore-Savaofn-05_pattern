package by.issoft.store;

import by.issoft.domain.Category;
import by.issoft.domain.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Store {
    private static Store instance;
    List<Category> list = new ArrayList<>();

    public void addToList(Category category) {
        this.list.add(category);
    }
    private Store() {

    }
    public static Store getInstance() //Singleton
    {
        if (instance==null){
            instance=new Store();
        }
        return instance;
    }
    public List<Category> getList() {
        return list;
    }

    public List<Product> allProduct(){
        List <Product> allProductList=new ArrayList();
        for (Category category:list){
            allProductList.addAll(category.getList());
        }
        return allProductList;
    }
}
