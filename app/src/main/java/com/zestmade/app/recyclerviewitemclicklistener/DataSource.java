package com.zestmade.app.recyclerviewitemclicklistener;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Quote> getQuotes() {

        List<Quote> quoteList = new ArrayList<>();

        quoteList.add(new Quote(
                "I decided to remain a fool when I discovered the wisdom of men.",
                "Zest Arinze"
        ));

        quoteList.add(new Quote(
                "The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty",
                "author"
        ));

        quoteList.add(new Quote(
                "Don’t Let Yesterday Take Up Too Much Of Today.",
                "Will Rogers"
        ));

        quoteList.add(new Quote(
                "You Learn More From Failure Than From Success. Don’t Let It Stop You. Failure Builds Character.",
                "Unknown"
        ));

        quoteList.add(new Quote(
                "It’s Not Whether You Get Knocked Down, It’s Whether You Get Up.",
                "Vince Lombardi"
        ));

        quoteList.add(new Quote(
                "If You Are Working On Something That You Really Care About, You Don’t Have To Be Pushed. The Vision Pulls You.",
                "Steve Jobs"
        ));

        quoteList.add(new Quote(
                "People Who Are Crazy Enough To Think They Can Change The World, Are The Ones Who Do.",
                "Rob Siltanen"
        ));

        quoteList.add(new Quote(
                "Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough.",
                "Og Mandino"
        ));

        quoteList.add(new Quote(
                "Entrepreneurs Are Great At Dealing With Uncertainty And Also Very Good At Minimizing Risk. That’s The Classic Entrepreneur.",
                "Mohnish Pabrai"
        ));

        quoteList.add(new Quote(
                "Disney The Way Get Started Is To Quit Talking And Begin Doing.",
                "Walt"
        ));

        return quoteList;
    }
}
