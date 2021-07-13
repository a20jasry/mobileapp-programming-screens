
# Rapport Assignment 4: Screens

The purpose of this assignment was to create a screen with the help of a fragment.

I stared by created a new class that i called LoginActivity and inside there i created a SetOnClickListener I did the same in MainActivity
so that when you push the button you are going to be able to go back and forth between the two screens.

```
  Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG", "starta aktiviteten");

                Intent intent = new Intent(LoginActivity. this, MainActivity.class);
                startActivity(intent);

            }
        });
  ---------------------------------

        Button close = findViewById(R.id.close);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d("MAIN", "Stänger aktiviten");

                        finish();
                    }
                });
```

in activity_Main I created a fragment, TextView and a button I also created a blankFragment and connected that to activity_Main.
to be able to make something inside my fragment i created fragment_blank and inside there i created a TextView and a Calender view.
and in activity_login i just created a button.

```
  <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintTop_toBottomOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintBottom_toTopOf="parent">

        <fragment
            android:name="com.example.screens.BlankFragment"
            android:layout_width="400dp"
            android:layout_height="400dp"
            android:tag="blank_fragment" />

        <TextView
            android:id="@+id/text"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textStyle="bold"
            android:layout_gravity="center"
            android:text="Hello World!"/>

        <Button
            android:id="@+id/close"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text=" Stäng Main"/>

    </LinearLayout>
```

```
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorPrimary"
    tools:context=".BlankFragment">

    <TextView
        android:layout_width="400dp"
        android:layout_height="350dp"
        android:text="@string/hello_blank_fragment" />

    <CalendarView
        android:id="@+id/calendarView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />


</FrameLayout>
```

```
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".LoginActivity">

    <Button
        android:id="@+id/open"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Start Main Page!"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

Bilder läggs i samma mapp som markdown-filen.

![](screen1.png)
![](screen2.png)
