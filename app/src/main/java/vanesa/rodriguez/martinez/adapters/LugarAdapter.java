package vanesa.rodriguez.martinez.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import vanesa.rodriguez.martinez.modelos.Lugar;

/**
 * Created by rocks on 19/10/2017.
 */

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.ViewHolder> {

    ArrayList<Lugar> lugares;
    Context context;

    public LugarAdapter(ArrayList<Lugar> lugares, Context context) {
        this.lugares = lugares;
        this.context = context;
    }

    @Override
    public LugarAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(LugarAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
