package fragments;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;

interface ResultFragmentBMI extends ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner {
    void setInformation(String information);

    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState);

    void onClick(View view);

    public interface onFragmentInteractionListener {
        void onTryAgainButtonClicked(String tag);
    }

    public interface OnFragmentInteractionListener {
    }
}
