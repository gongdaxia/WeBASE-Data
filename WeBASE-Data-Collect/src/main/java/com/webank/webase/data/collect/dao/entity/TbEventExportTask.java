package com.webank.webase.data.collect.dao.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class TbEventExportTask implements Serializable {

    public TbEventExportTask(Integer chainId, Integer groupId, String contractAddress, String eventName) {
        this.chainId = chainId;
        this.groupId = groupId;
        this.contractAddress = contractAddress;
        this.eventName = eventName;
    }

    public TbEventExportTask(Byte taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.chain_id
     *
     * @mbg.generated
     */
    private Integer chainId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.group_id
     *
     * @mbg.generated
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.contract_name
     *
     * @mbg.generated
     */
    private String contractName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.contract_address
     *
     * @mbg.generated
     */
    private String contractAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.event_name
     *
     * @mbg.generated
     */
    private String eventName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.block_number
     *
     */
    private BigInteger blockNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.task_status
     *
     * @mbg.generated
     */
    private Byte taskStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_event_export_task.modify_time
     *
     * @mbg.generated
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}
