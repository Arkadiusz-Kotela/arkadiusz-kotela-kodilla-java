package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials millenial = new Millenials("Milenials");
        YGeneration yGeneration = new YGeneration("YGeneration");
        ZGeneration zGeneration = new ZGeneration("ZGeneration");

        //When
        String millenialDefaultSocialPublisher = millenial.getSocialPublisher().share();
        String yGenerationDefaultSocialPublisher = yGeneration.getSocialPublisher().share();
        String zGenerationDefaultSocialPublisher = zGeneration.getSocialPublisher().share();

        //Then
        Assert.assertEquals("Publishing using Snapchat", millenialDefaultSocialPublisher);
        Assert.assertEquals("Publishing using Twitter", yGenerationDefaultSocialPublisher);
        Assert.assertEquals("Publishing using Facebook", zGenerationDefaultSocialPublisher);

    }

    @Test
    public void testIndividualSharingStrategies() {
        //Given
        Millenials millenial = new Millenials("Milenials");
        YGeneration yGeneration = new YGeneration("YGeneration");
        ZGeneration zGeneration = new ZGeneration("ZGeneration");

        //When
        millenial.setSocialPublisher(new FacebookPublisher());
        yGeneration.setSocialPublisher(new SnapchatPublisher());
        zGeneration.setSocialPublisher(new TwitterPublisher());

        String millenialIndividualSocialPublisher = millenial.getSocialPublisher().share();
        String yGenerationIndividualSocialPublisher = yGeneration.getSocialPublisher().share();
        String zGenerationIndividualSocialPublisher = zGeneration.getSocialPublisher().share();

        //Then
        Assert.assertEquals("Publishing using Facebook", millenialIndividualSocialPublisher);
        Assert.assertEquals("Publishing using Snapchat", yGenerationIndividualSocialPublisher);
        Assert.assertEquals("Publishing using Twitter", zGenerationIndividualSocialPublisher);

    }

}
