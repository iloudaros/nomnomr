package com.example.project;

public class Options {
    private enum orderType{
      food,
      drink,
      coffee
    }
    private enum sortBy{
      popularity,
      proximity,
      speed,
      minmum_cost
    }
    private int groupSize;
    private int maxShops;

    public orderType getOrderType() {
      return orderType;
    }

    public sortBy getSortBy() {
      return sortBy;
    }

    public int getGroupSize() {
      return groupSize;
    }

    public int getMaxShops() {
      return maxShops;
    }

    public void setOrderType(orderType orderType) {
      this.orderType = orderType;
    }

    public void setSortBy(sortBy sortBy) {
      this.sortBy = sortBy;
    }

    public void setGroupSize(int groupSize) {
      this.groupSize = groupSize;
    }

    public void setMaxShops(int maxShops) {
      this.maxShops = maxShops;
    }
