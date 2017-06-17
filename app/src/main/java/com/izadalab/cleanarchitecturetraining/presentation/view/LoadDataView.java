package com.izadalab.cleanarchitecturetraining.presentation.view;

import android.content.Context;

/**
 * Created by izadalab on 6/17/17.
 */

public interface LoadDataView {
    void showLoading();
    void hideLoading();
    void showError(String errorMessage);
    Context context();
}
