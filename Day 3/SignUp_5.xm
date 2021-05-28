<LinearLayout
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    android:orientation="vertical"
    xmlns:android="http://schemas.android.com/apk/res/android">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Choose a password"
        android:textColor="@color/black"
        android:textSize="30dp"
        android:singleLine="true"
        android:textStyle="bold"
        android:layout_marginTop="100dp"
        android:gravity="center"/>
    <EditText
        android:id="@+id/s2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Password"
        android:drawableLeft="@drawable/lock"
        android:padding="10dp"
        android:imeOptions="actionNext"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"
        android:layout_marginTop="50dp"
        android:singleLine="true"
        android:drawablePadding="10dp"
        android:textSize="20dp"
        android:inputType="textPassword" />
    <Button
        android:id="@+id/b1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Next"
        android:gravity="center"
        android:background="@color/blue"
        android:textColor="@color/white"
        android:layout_marginTop="80dp"
        android:textSize="20dp"
        android:imeOptions="actionDone"
        android:singleLine="true"
        android:layout_marginRight="30dp"
        android:layout_marginLeft="30dp"
        android:padding="5dp"/>









</LinearLayout>
