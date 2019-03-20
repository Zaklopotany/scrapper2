package com.example.demo.core;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LayerScrapper implements GenericScrapperInt {

    private static ConcurrentHashMap<Object, Resource> resources;
    private static ConcurrentHashMap<Object, Object> scrappedPages;
    private List<Object> continueConditions;
    private AtomicInteger pointer;
    private Object currentUrl;


    @Override
    public boolean checkContinueCondition() {
        return false;
    }

    //observer pattern could be used to inform

    @Override
    public void execute() {

        //get Browser
        //loop starting point go to first url
        //go to main page
        //checkForResources
        //scrapResources
        //validateContinue condition
        //finalise free browser resource
    }

}
