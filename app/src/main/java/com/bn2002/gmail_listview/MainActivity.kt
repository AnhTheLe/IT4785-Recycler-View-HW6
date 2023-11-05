package com.bn2002.gmail_listview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var mails: ArrayList<MailModel>
    private lateinit var listView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.mail_list_view)
        title = "Inbox"
        initMailData()
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = MailAdapter(mails)
    }

    private fun initMailData() {
        mails = ArrayList<MailModel>()
        mails += MailModel(title = "Welcome Aboard", content = "Welcome to our platform! We're thrilled to have you with us.")
        mails += MailModel(title = "Holiday Deals", content = "Explore our holiday deals and grab exciting offers before they're gone!")
        mails += MailModel(title = "Product Showcase", content = "Witness our latest product showcase. Discover innovation at its best.")
        mails += MailModel(title = "Community Update", content = "Join our community update and be part of something special.")
        mails += MailModel(title = "Tech Trends", content = "Stay ahead with the latest tech trends and advancements.")
        mails += MailModel(title = "Exclusive Access", content = "Unlock exclusive access to premium content and features.")
        mails += MailModel(title = "Customer Survey", content = "Your opinion matters! Participate in our customer survey today.")
        mails += MailModel(title = "Spring Collection", content = "Introducing our vibrant and stylish spring collection.")
        mails += MailModel(title = "Membership Benefits", content = "Discover the perks and benefits of our membership program.")
        mails += MailModel(title = "Limited Time Offer", content = "Hurry! Limited time offer with discounts you can't miss.")
        mails += MailModel(title = "Business Insights", content = "Get valuable insights for your business success.")
        mails += MailModel(title = "Upcoming Webinar", content = "Register for our insightful upcoming webinar session.")
        mails += MailModel(title = "Health & Wellness", content = "Prioritize your health and wellness with our tips and advice.")
        mails += MailModel(title = "Entertainment Updates", content = "Stay updated on the latest in the world of entertainment.")
        mails += MailModel(title = "Educational Resources", content = "Explore our educational resources for continuous learning.")
        mails += MailModel(title = "Fashion Trends", content = "Catch up on the latest fashion trends and styles.")
        mails += MailModel(title = "Job Opportunities", content = "Exciting job opportunities waiting for you. Explore now!")
        mails += MailModel(title = "Inspiration Hub", content = "Visit our inspiration hub for daily doses of motivation.")
        mails += MailModel(title = "Travel Destinations", content = "Plan your next dream vacation with our top travel destinations.")
        mails += MailModel(title = "Financial Tips", content = "Learn effective financial tips and manage your finances better.")
    }

}