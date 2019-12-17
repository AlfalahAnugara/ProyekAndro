package android.jplas.proyekandro.fragments;


import android.jplas.proyekandro.activities.ShopItem;
import android.jplas.proyekandro.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class TotalItemFragment extends Fragment {

    View view;
    ShopItem items;

    public TotalItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_total_item, container, false);
        TextView textView = (TextView) view.findViewById(R.id.textData);
        Bundle data = this.getArguments();

            items = data.getParcelable("sxhop");
            String dat = items.getNama()+" Total biaya anda "+items.getJumlah();
            textView.setText(dat);

        return view;

    }

}
