package com.example.order;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;
    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Window w= getWindow();
        setTitle(" Our Menu");


        toolbar=findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);



        mRecyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);




        GridLayoutManager gridLayoutManager=new GridLayoutManager(MainActivity2.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList=new ArrayList<>();
        mFoodData=new FoodData("Chicken","Who doesn't love a recipe that takes only 5 mins to pull together and tastes great too! Contains Nutrients which Provides Vitamins and Minerals that are necessary for your diet. It is easy to cook and Strengthens Bones and Promotes Heart Health; AVAILABLE AT: RT, HYD-DARBAR, LAL-QILA and many more... ","Rs.300", R.drawable.chicken);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Biryani"," Biryani is rich in Vit-B-6 which controls body's metabolic function and one of the fav. dishes of asian's; AVAILABLE AT: RT,BBQ-TONIGHT, HYD-DARBAR, LAL-QILA, HAMID, SHABIR and many more...","Rs.250", R.drawable.biryani);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Creamy White Handi","Creamy chicken handi is another very popular and famous dish nowadays which is trending throughout the country. Creamy chicken handi is served in the well-esteemed hotels and restaurant,It is easy to cook and Strengthens Bones and Promotes Heart Health; AVAILABLE AT: RT, HYD-DARBAR, LAL-QILA and many more...","Rs.400", R.drawable.handi);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Shashlik & Rice","Shashlik is basically like a shish kebab, which translates to skewered meat and is a dish that was popular in central and South Asia. Shish were generally made using chunks of lamb, but chicken kebabs have become just as popular. ... For this dish, it's all about balancing the sweet, sour, salt and chilli flavours; AVAILABLE AT: RT, HYD-DARBAR, LAL-QILA and many more...","Rs.300", R.drawable.shashlik);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Spicy Chana Chat","The spices that make up chaat are each highly nutritious and deliver nutrients such as: Minerals: Mango powder, asafoetida, and cumin are all popular ingredients in chaat masala and are also good sources of iron and calcium; AVAILABLE AT: SADDAR, HYD-WAARI, QASIMABAD and many more...","Rs.150", R.drawable.chat);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("French Fries","French fries often are criticized as unhealthy. But new research shows that the food provides health benefits, according to the the Alliance for Potato Research and Education that French fries, as part of mixed meals, produce lower blood glucose and insulin levels in children; the organization says AVAILABLE AT ALL HYD. RESTAURANTS AND HOME'S ","Rs.120", R.drawable.fries);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Burger","A hamburger does provide some nutritional value. It is a good source of protein, iron, phosphorus, and several other nutrients. If you choose to eat your hamburger on whole grain bun, it may also provide healthy, filling fiber; AVAILABLE AT: MC,KFC, BURGER-LAB,PIATTO and many more...","Rs.450", R.drawable.burger);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Pizza With Topping","Pizza with Topping can boost your immunity. The Topping on a pizza is loaded with Vitamin C, Pizza contains nutritious ingredients and gives your brain a boost also enriched in taste and spices ; AVAILABLE AT: PIZZA-HUT, BOARDWAY, PIZZA-20, PIATTO and many more... ","Rs.900", R.drawable.pizza);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Spaghetti","Low Sodium and Cholesterol Free: If you're watching your cholesterol levels, pasta and spaghetti is perfect for you, being very low in sodium and cholesterol free; AVAILABLE AT: PIZZA-HUT, BOARDWAY, PIZZA-20, PIATTO and many more...","Rs.400", R.drawable.spaghetti);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Ice Cream","It Is loaded with vitamins and minerals, gives you energy and helps boost your immunity plus stimulating your brain moreover makes you Happy..!! AVAILABLE AT: MC,KFC,WALLS,BASKIN-ROBBINS and manymore...","Rs.200", R.drawable.icecream);
        myFoodList.add(mFoodData);
        mFoodData=new FoodData("Cakes","Cake can reduce stress levels and is the best way to celebrate any occasion and bring everyone together. Eating a little snack before bed can help you sleep; and cake is sure to give you sweet dreams. AVALIABLE AT: MY-NEW, BOMBAY BAKERY,BLACK n BROWN, PIE in the SKY and many more...","Rs.250", R.drawable.deserts);
        myFoodList.add(mFoodData);





        MyAdapter myAdapter=new MyAdapter (MainActivity2.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);



    }
}