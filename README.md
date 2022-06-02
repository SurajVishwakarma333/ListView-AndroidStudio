# ListView 
In this project i covered ListView topic.

Refer this for study purpose.(ListView is outdated instead of ListView use RecyclerView which is more updated and latest)



![WhatsApp Image 2022-04-23 at 2 54 43 PM](https://user-images.githubusercontent.com/101108540/164888746-9ab9201a-cf1a-4ccb-8ad1-83fbf08a9109.jpeg)



after clicking on mumbai it shows Toast message.





![WhatsApp Image 2022-04-23 at 2 55 18 PM](https://user-images.githubusercontent.com/101108540/164888750-956c238b-761c-4ce6-b8b1-0bce5a02fb75.jpeg)




# Attributes of ListView:

1. divider: This is a drawable or color to draw between different list items.
   Below is the id attribute’s example code with explanation included.
   
   
           <!--Divider code in ListView-->
          <ListView
            android:id="@+id/simpleListView"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:divider="#f00"
           />



2. dividerHeight: This specify the height of the divider between list items. This could be in dp(density pixel),sp(scale independent pixel) or px(pixel).
        
        
           <!--Divider code in ListView-->
            <ListView
              android:id="@+id/simpleListView"
              android:layout_width="fill_parent"
              android:layout_height="wrap_content"
              android:divider="#f00"
              android:dividerHeight="1dp"
            />
           
3. listSelector: listSelector property is used to set the selector of the listView. It is generallyorange or Sky blue color mostly but you can also define your custom    color or an image as a list selector as per your design.



            <!-- List Selector Code in ListView -->
             <ListView
              android:id="@+id/simpleListView"
              android:layout_width="fill_parent"
              android:layout_height="wrap_content"
              android:listSelector="#0f0" <!--list selector in green color-->
              />



           
