package jacktlee.counterwatch;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

public class DBHandler extends SQLiteOpenHelper
{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "heroesDB.db";
    private static final String TABLE_HEROES = "heroes";

    public static final String COLUMN_NAME = "Name";
    public static final String COLUMN_GENJI = "Genji";
    public static final String COLUMN_MCCREE = "McCree";
    public static final String COLUMN_PHARAH = "Pharah";
    public static final String COLUMN_REAPER = "Reaper";
    public static final String COLUMN_76 = "Solder:76";
    public static final String COLUMN_TRACER = "Tracer";
    public static final String COLUMN_BASTION = "Bastion";
    public static final String COLUMN_HANZO = "Hanzo";
    public static final String COLUMN_JUNKRAT = "Junkrat";
    public static final String COLUMN_MEI = "Mei";
    public static final String COLUMN_TORBJORN = "Torbjorn";
    public static final String COLUMN_WIDOWMAKER = "Widowmaker";
    public static final String COLUMN_DVA = "D.Va";
    public static final String COLUMN_REINHARDT = "Reinhardt";
    public static final String COLUMN_ROADHOG = "Roadhog";
    public static final String COLUMN_WINSTON = "Winston";
    public static final String COLUMN_ZARYA = "Zarya";
    public static final String COLUMN_ANA = "Ana";
    public static final String COLUMN_LUCIO = "Lucio";
    public static final String COLUMN_MERCY = "Mercy";
    public static final String COLUMN_ZENYATTA = "Zenyatta";
    public static final String COLUMN_SYMMETRA = "Symmetra";

    public DBHandler(Context context)
    {
        super(context, DATABASE_NAME , null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String CREATE_HERO_TABLE =
                "CREATE TABLE IF NOT EXISTS " + TABLE_HEROES + "(" + COLUMN_NAME + "TEXT,"
                + COLUMN_GENJI + "INTEGER DEFAULT 0," + COLUMN_MCCREE + "INTEGER DEFAULT 0,"
                + COLUMN_PHARAH + "INTEGER DEFAULT 0," + COLUMN_REAPER + "INTEGER DEFAULT 0,"
                + COLUMN_76 + "INTEGER DEFAULT 0," + COLUMN_TRACER + "INTEGER DEFAULT 0,"
                + COLUMN_BASTION + "INTEGER DEFAULT 0," + COLUMN_HANZO + "INTEGER DEFAULT 0,"
                + COLUMN_JUNKRAT + "INTEGER DEFAULT 0," + COLUMN_MEI + "INTEGER DEFAULT 0,"
                + COLUMN_TORBJORN + "INTEGER DEFAULT 0," + COLUMN_WIDOWMAKER + "INTEGER DEFAULT 0,"
                + COLUMN_DVA + "INTEGER DEFAULT 0," + COLUMN_REINHARDT + "INTEGER DEFAULT 0,"
                + COLUMN_ROADHOG + "INTEGER DEFAULT 0," + COLUMN_WINSTON + "INTEGER DEFAULT 0,"
                + COLUMN_ZARYA + "INTEGER DEFAULT 0," + COLUMN_ANA +  "INTEGER DEFAULT 0,"
                + COLUMN_LUCIO + "INTEGER DEFAULT 0," + COLUMN_MERCY + "INTEGER DEFAULT 0,"
                + COLUMN_ZENYATTA + "INTEGER DEFAULT 0," + COLUMN_SYMMETRA + "INTEGER DEFAULT 0)";

        db.execSQL(CREATE_HERO_TABLE);

        String INSERT_HERO = "INSERT INTO" + TABLE_HEROES + "(" + COLUMN_NAME + "," + COLUMN_GENJI
            + "," + COLUMN_MCCREE + "," + COLUMN_PHARAH + "," + COLUMN_REAPER + "," + COLUMN_76
            + "," + COLUMN_TRACER + "," + COLUMN_BASTION + "," + COLUMN_HANZO + "," + COLUMN_JUNKRAT
            + "," + COLUMN_MEI + "," + COLUMN_TORBJORN + "," + COLUMN_WIDOWMAKER + "," + COLUMN_DVA
            + "," + COLUMN_REINHARDT + COLUMN_ROADHOG + "," + COLUMN_WINSTON + "," + COLUMN_ZARYA
            + "," + COLUMN_ANA + "," + COLUMN_LUCIO + "," + COLUMN_MERCY + "," + COLUMN_ZENYATTA
            + "," + COLUMN_SYMMETRA + ")VALUES";

        db.execSQL(INSERT_HERO + "('Genji', 0, 0, 0, 0, 1, 0, 1, 1, 0, -1, 0, " +
                "1, 0, 0, -1, -1, -1, 0, 0, 0, -1, 0)");
        db.execSQL(INSERT_HERO + "('McCree', 0, 0, 0, 0, 1, 0, 1, -1, -1, 0, " +
                "0, 0, -1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0)");
        db.execSQL(INSERT_HERO + "('Pharah', 0, 0, 0, 0, 1, -1, 1, 0, -1, 1, " +
                "1, 1, -1, 0, 1, -1, 0, 1, 0, 0, 0, 0, 1, 0)");
        db.execSQL(INSERT_HERO + "('Reaper', 0, -1, -1, 0, 0, 0, 0, 0, 0," +
                "1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_HEROES);
        onCreate(db);
    }
}