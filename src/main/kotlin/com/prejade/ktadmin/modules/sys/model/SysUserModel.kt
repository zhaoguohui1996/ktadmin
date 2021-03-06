package com.prejade.ktadmin.modules.sys.model

class SysUserModel {
    var id: Int? = null
    lateinit var username: String
    lateinit var nickname: String
    var mobile: String? = null
    var email: String? = null
    var tel: String? = null
    var avatar: String? = null
    var lastLoginIp: String? = null
    var lastLoginTime: String? = null
    var creatorId: String? = null
    var merchantCode: String? = null
    var status: String? = null
    var statusName: String? = null
    var createTime: String? = null
    var roles: List<String> = arrayListOf()
    var roleLabels: List<String> = arrayListOf()
    var permissions: List<String> = arrayListOf()
    var depId: Int? = null
    var depName: String? = null
    var roleNames: String? = null
    var introduction: String? = null
}

class AddUser {
    var id: Int? = null
    lateinit var username: String
    lateinit var name: String
    lateinit var mobile: String
    var email: String? = null
    var depId: Int? = null
    var tel: String? = null
    lateinit var roles: String
}

class UpdAccount {
    lateinit var name: String
    lateinit var mobile: String
    var tel: String? = null
    var email: String? = null
    var introduction: String? = null
}

class ExistUser {
    var id: Int? = null
    lateinit var name: String
    var depId: Int? = null
    var depName: String? = null
    lateinit var mobile: String
    var tel: String? = null
    var email: String? = null
}
