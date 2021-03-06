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

public class WordsSpoken extends StatCraftStatistic {

    private static final WordsSpoken instance = new WordsSpoken();

    public static WordsSpoken getInstance() {
        return instance;
    }

    @NotNull
    @Override
    public String getName() {
        return "Words Spoken";
    }

    @Override
    public int getIndex() {
        return 26;
    }
}
