package com.example.covid19.ui.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.covid19.R
import com.example.covid19.data.res.Advice
import com.example.covid19.ui.adapter.AdviceAdapter
import kotlinx.android.synthetic.main.fragment_mythbuster.*
import kotlinx.android.synthetic.main.fragment_mythbuster.view.*

/**
 * A simple [Fragment] subclass.
 */
class MythbusterFragment : Fragment() {

    val list = arrayListOf<Advice>()
    val adviceAdapter = AdviceAdapter(list)

    val title = arrayOf("Are hand dryers effective in killing the new coronavirus?",
        "Can an ultraviolet disinfection lamp kill the new coronavirus?",
        "How effective are thermal scanners in detecting people infected with the new coronavirus?",
        "Can spraying alcohol or chlorine all over your body kill the new coronavirus?",
        "Is it safe to receive a letter or a package from China?",
        "Can pets at home spread the new coronavirus (2019-nCoV)?",
        "Do vaccines against pneumonia protect you against the new coronavirus?",
        "Can regularly rinsing your nose with saline help prevent infection with the new coronavirus?",
        "Can eating garlic help prevent infection with the new coronavirus?",
        "Does putting on sesame oil block the new coronavirus from entering the body?",
        "Does the new coronavirus affect older people, or are younger people also susceptible?",
        "Are antibiotics effective in preventing and treating the new coronavirus?",
        "Are there any specific medicines to prevent or treat the new coronavirus?")

    val subTitle = arrayOf("No. Hand dryers are not effective in killing the 2019-nCoV. To protect yourself against the new coronavirus, you should frequently clean your hands with an alcohol-based hand rub or wash them with soap and water. Once your hands are cleaned, you should dry them thoroughly by using paper towels or a warm air dryer.",
        "UV lamps should not be used to sterilize hands or other areas of skin as UV radiation can cause skin irritation.",
        "Thermal scanners are effective in detecting people who have developed a fever (i.e. have a higher than normal body temperature) because of infection with the new coronavirus.\n\nHowever, they cannot detect people who are infected but are not yet sick with fever. This is because it takes between 2 and 10 days before people who are infected become sick and develop a fever.",
        "No. Spraying alcohol or chlorine all over your body will not kill viruses that have already entered your body. Spraying such substances can be harmful to clothes or mucous membranes (i.e. eyes, mouth). Be aware that both alcohol and chlorine can be useful to disinfect surfaces, but they need to be used under appropriate recommendations.",
        "Yes, it is safe. People receiving packages from China are not at risk of contracting the new coronavirus. From previous analysis, we know coronaviruses do not survive long on objects, such as letters or packages.",
        "At present, there is no evidence that companion animals/pets such as dogs or cats can be infected with the new coronavirus. However, it is always a good idea to wash your hands with soap and water after contact with pets. This protects you against various common bacteria such as E.coli and Salmonella that can pass between pets and humans.",
        "No. Vaccines against pneumonia, such as pneumococcal vaccine and Haemophilus influenza type B (Hib) vaccine, do not provide protection against the new coronavirus.\n\nThe virus is so new and different that it needs its own vaccine. Researchers are trying to develop a vaccine against 2019-nCoV, and WHO is supporting their efforts.\n\nAlthough these vaccines are not effective against 2019-nCoV, vaccination against respiratory illnesses is highly recommended to protect your health.",
        "No. There is no evidence that regularly rinsing the nose with saline has protected people from infection with the new coronavirus.\n\nThere is some limited evidence that regularly rinsing nose with saline can help people recover more quickly from the common cold. However, regularly rinsing the nose has not been shown to prevent respiratory infections.",
        "Garlic is a healthy food that may have some antimicrobial properties. However, there is no evidence from the current outbreak that eating garlic has protected people from the new coronavirus.",
        "No. Sesame oil does not kill the new coronavirus. There are some chemical disinfectants that can kill the 2019-nCoV on surfaces. These include bleach/chlorine-based disinfectants, either solvents, 75% ethanol, peracetic acid and chloroform.\n\nHowever, they have little or no impact on the virus if you put them on the skin or under your nose. It can even be dangerous to put these chemicals on your skin.",
        "People of all ages can be infected by the new coronavirus (2019-nCoV). Older people, and people with pre-existing medical conditions (such as asthma, diabetes, heart disease) appear to be more vulnerable to becoming severely ill with the virus.\n\nWHO advises people of all ages to take steps to protect themselves from the virus, for example by following good hand hygiene and good respiratory hygiene.",
        "No, antibiotics do not work against viruses, only bacteria.\n\nThe new coronavirus (2019-nCoV) is a virus and, therefore, antibiotics should not be used as a means of prevention or treatment.\n\nHowever, if you are hospitalized for the 2019-nCoV, you may receive antibiotics because bacterial co-infection is possible.",
        "To date, there is no specific medicine recommended to prevent or treat the new coronavirus (2019-nCoV).\n\nHowever, those infected with the virus should receive appropriate care to relieve and treat symptoms, and those with severe illness should receive optimized supportive care. Some specific treatments are under investigation, and will be tested through clinical trials. WHO is helping to accelerate research and development efforts with a range or partners.")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_mythbuster, container, false)

        for (i in 0..12){
            val advice = Advice(title[i],subTitle[i])
            list.add(advice)
        }
        view.adviceRv.apply {
            layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
            adapter = adviceAdapter
        }

        return view
    }


}
