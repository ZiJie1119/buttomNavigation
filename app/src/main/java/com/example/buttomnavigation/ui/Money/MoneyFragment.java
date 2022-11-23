package com.example.buttomnavigation.ui.Money;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.buttomnavigation.databinding.FragmentMoneyBinding;

public class MoneyFragment extends Fragment {

    private FragmentMoneyBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MoneyViewModel moneyViewModel =
                new ViewModelProvider(this).get(MoneyViewModel.class);

        binding = FragmentMoneyBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMoney;
        moneyViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}