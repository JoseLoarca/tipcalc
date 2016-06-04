package org.jcloarca.tipcalculator.fragments;

import org.jcloarca.tipcalculator.models.TipRecord;

/**
 * Created by JCLoarca on 6/4/2016.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
