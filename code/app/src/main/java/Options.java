package com.example.project;

public class Options {
    private enum orderType{
      food,
      drink,
      coffee
    }

    private orderType type;

    private enum sortBy {
        popularity,
        proximity,
        speed,
        minmum_cost
    }

    private sortBy sort;

    private int groupSize;
    private int maxShops;

    public orderType getOrderType() {
        return type;
    }

    public sortBy getSortBy() {
        return this.sort;
    }

    public int getGroupSize() {
      return groupSize;
    }

    public int getMaxShops() {
      return maxShops;
    }

    public void setOrderType(orderType newType) {
        this.type = newType;
    }

    public void setSort(sortBy newSort) {
        this.sort = newSort;
    }

    public void setGroupSize(int groupSize) {
      this.groupSize = groupSize;
    }

    public void setMaxShops(int maxShops) {
      this.maxShops = maxShops;
    }
