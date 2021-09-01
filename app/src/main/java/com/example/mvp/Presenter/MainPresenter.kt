package com.example.mvp.Presenter

import com.example.mvp.Contract.MainContract
import com.example.mvp.Model.MainModel


private var mainContractView: MainContract.View? = null

class MainPresenter : MainContract.Presenter {


    override fun onAttach(view: MainContract.View) {
        mainContractView = view
        mainContractView!!.ShowData(MainModel.getData())
    }

    override fun onDetach() {
        mainContractView = null
    }
}