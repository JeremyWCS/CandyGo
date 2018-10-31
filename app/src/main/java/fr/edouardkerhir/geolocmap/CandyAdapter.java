package fr.edouardkerhir.geolocmap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class CandyAdapter extends ArrayAdapter<bonbonItemInfoWindow> {
    int level;

    public CandyAdapter(Context context, ArrayList<bonbonItemInfoWindow> candyPlace, int level) {

        super(context, 0, candyPlace);
        this.level=level;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CandySingleton.getInstance();
        bonbonItemInfoWindow bonbon = getItem(position);
        int bonbonIndex = bonbon.getIndexSingleton();
        int bonbonCount = bonbon.getNbEachCandy();
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_custom_info_winidow, parent, false);
        }
        ImageView candyImg = convertView.findViewById(R.id.item_img);
        TextView candyNb = (TextView) convertView.findViewById(R.id.item_number);
        if (level == 1) {
            ArrayList<CandyModel> arraycandyModel = CandySingleton.getInstance().getCandyArrayList();
            candyImg.setImageResource(arraycandyModel.get(bonbonIndex).getImage());
            candyNb.setText(": x"+bonbonCount);
        }else if (level == 2) {
            ArrayList<CandyModel> arraycandyModel1 = CandySingleton.getInstance().getCandyArrayList1();
            candyImg.setImageResource(arraycandyModel1.get(bonbonIndex).getImage());
            candyNb.setText(": x"+bonbonCount);

        }else {
            ArrayList<CandyModel> arraycandyModel2 = CandySingleton.getInstance().getCandyArrayList2();
            candyImg.setImageResource(arraycandyModel2.get(bonbonIndex).getImage());
            candyNb.setText(": x"+bonbonCount);
        }


        // Get the data item for this position

        return convertView;
    }
}
