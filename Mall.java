import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mall
{
    public class DataComparision implements Comparator<EntryData>
    {
        @Override
        public int compare(EntryData data1, EntryData data2)
        {
           return (data1.epochTime - data2.epochTime);
        }
    }

    public class EntryData
    {
       private int count, epochTime;
       private ActionType actionType;

    public EntryData(int count, int epochTime, ActionType actionType)
    {
        this.count = count;
        this.epochTime = epochTime;
        this.actionType = actionType;
    }

    public int getCount()
    {
        return count;
    }

    public long getEpochTime()
    {
        return epochTime;
    }

    public ActionType getActionType()
    {
        return actionType;
    }
  }

  public enum ActionType
  {
     ENTRY, EXIT;
  }

  public long[] getTimeWithMaximumPeople(List<EntryData> data)
  {
      long[] result = { 0, 0, 0 }; //Entry time,Exit time,totalPeople

      if (data == null || data.size() == 0)
        return result;

      Collections.sort(data, new MallTimeWithMaximumPeople.DataComparision());

      int dataSize = data.size();
      int count = 0, maxCount = 0;

      for (int i = 0; i < dataSize; i++)
      {
        EntryData currentData = data.get(i);

        if (currentData.getActionType() == ActionType.ENTRY){
            count += currentData.getCount();} //adding the 
        else{
            count -= currentData.getCount();
        }
        
        
        if (i < dataSize - 1 && currentData.getEpochTime() == data.get(i + 1).getEpochTime())
            continue;

        if (count > maxCount)
        {
            maxCount = count;
            result[0] = currentData.getEpochTime();

            if (i < dataSize - 1)
                result[1] = data.get(i + 1).getEpochTime();
            else
                result[1] = data.get(i).getEpochTime();

            result[2] = maxCount;
        }
    }

    return result;
  }

  public static void main(String args[])
  {
      Mall instance = new Mall();

      List<EntryData> data = new ArrayList<EntryData>();
      EntryData data1 = instance.new EntryData(50, 0, ActionType.ENTRY); //50
      EntryData data3 = instance.new EntryData(150, 2, ActionType.ENTRY); //150
      EntryData data4 = instance.new EntryData(25,1, ActionType.EXIT);
      EntryData data2 = instance.new EntryData(0, 3, ActionType.EXIT); //Exit =>200 crowd exist in the Mall
      data.add(data1); data.add(data2); data.add(data3); data.add(data4);

      long[] result = instance.getTimeWithMaximumPeople(data);
      System.out.println(Arrays.toString(result));
  }
}
