package cn.nil_null_naught.gd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 菜单表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "menu")
public class Menu {
    private Integer menu_id;
    private String title;
    private String menu_introduction;
    private String creator;
    private String menu_collections;
    private Timestamp create_time;
    private String menu_image;
}
