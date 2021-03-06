package com.prejade.ktadmin.modules.sys.entity

import com.prejade.ktadmin.modules.sys.enumes.RoleDataPermissionType
import javax.persistence.*


/**
 * 角色
 */
@Entity
class SysRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @Column(unique = true, nullable = false)
    lateinit var name: String

    @Column(unique = true, nullable = false)
    lateinit var label: String

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "sys_role_permission",
        joinColumns = [JoinColumn(name = "sys_role_id")],
        inverseJoinColumns = [JoinColumn(name = "sys_permission_id")]
    )
    var permissions: List<SysPermission> = ArrayList()

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    var dataPermissionType: RoleDataPermissionType = RoleDataPermissionType.USER

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "sys_role_data_permission",
        joinColumns = [JoinColumn(name = "sys_role_id")],
        inverseJoinColumns = [JoinColumn(name = "sys_dep_id")]
    )
    var depDataPermission: List<SysDep> = ArrayList()

    @Transient
    fun getDepIdDataPermission(): List<Int> {
        return this.depDataPermission.map { it.id!! }
    }
}
