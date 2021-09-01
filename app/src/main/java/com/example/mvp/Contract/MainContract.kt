package com.example.mvp.Contract

import com.example.mvp.Model.User

interface MainContract {

    interface View{

     fun ShowData(mutableList: MutableList<User>)
    }


    interface Presenter{
        fun onAttach(view:View)
        fun onDetach()
    }
}