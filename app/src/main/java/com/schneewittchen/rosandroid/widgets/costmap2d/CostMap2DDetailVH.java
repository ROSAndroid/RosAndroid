package com.schneewittchen.rosandroid.widgets.costmap2d;

import android.view.View;

import com.schneewittchen.rosandroid.model.entities.widgets.BaseEntity;
import com.schneewittchen.rosandroid.ui.views.details.SubscriberLayerViewHolder;

import java.util.Collections;
import java.util.List;

import nav_msgs.OccupancyGrid;
import nav_msgs.Path;


/**
 * TODO: Description
 *
 * @author Nico Studt
 * @version 1.0.0
 * @created on 08.03.21
 */
public class CostMap2DDetailVH extends SubscriberLayerViewHolder {


    @Override
    protected void initView(View parentView) {

    }

    @Override
    protected void bindEntity(BaseEntity entity) {

    }

    @Override
    protected void updateEntity(BaseEntity entity) {

    }

    @Override
    public List<String> getTopicTypes() {
        return Collections.singletonList(OccupancyGrid._TYPE);
    }
}