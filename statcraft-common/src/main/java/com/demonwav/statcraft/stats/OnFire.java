/*
 * StatCraft Plugin
 *
 * Copyright (c) 2016 Kyle Wood (DemonWav)
 * https://www.demonwav.com
 *
 * MIT License
 */

package com.demonwav.statcraft.stats;

import com.demonwav.statcraft.api.StatCraftStatistic;

import org.jetbrains.annotations.NotNull;

public class OnFire extends StatCraftStatistic {

    private static final OnFire instance = new OnFire();

    public static OnFire getInstance() {
        return instance;
    }

    @NotNull
    @Override
    public String getName() {
        return "On Fire";
    }

    @Override
    public int getIndex() {
        return 17;
    }
}
